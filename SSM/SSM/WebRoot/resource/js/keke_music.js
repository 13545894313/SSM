/*
 1：播放暂停
 2：时间的显示
 3：进度条的显示
 4：音乐的切换（上一首和下一首）
 5：静音
 6：随机播放，顺序播放，单曲循环
 7：歌词
 
 * */
//播放对象
function dom(id){
	return document.getElementById(id);
};

//播放器
var keAudio = {
	audioDom:null,
	init:function(callback){//播放器初始化
		this.audioDom = dom("audio");
		this.time(callback);
	},
	
	//播放
	play:function(){
		this.audioDom.play();
	},
	
	//暂停
	stop:function(){
		this.audioDom.pause();
	},
	
	time:function(callback){//时间
		var $this = this;
		//加载完毕的函数 
		this.audioDom.addEventListener("canplaythrough",function(){
			if(callback)callback.call(this,true,$this.format(this.duration));
		});
		//播放中的函数 timeupdate
		this.audioDom.addEventListener("timeupdate",function(){
			var ctime = this.currentTime;
			var percent =Math.floor((ctime / this.duration) * 100);
			if(callback)callback.call(this,false,$this.format(ctime),percent);
		});
	},
	
	format:function(time){//日期格式化
		var m=Math.floor(time/60);
		var s =Math.floor(time%60);
		if(m<10)m="0"+m;
		if(s<10)s="0"+s;
		return m+":"+s;
	},
	
	mute:function(){//静音
		
	},
	
	next:function(){//下一首
		
	},
	
	prev:function(){//上一首
		
	},
	
	randomMusic:function(){//随机播放
		
	},
	
	loadLrc:function(){//加载歌词
		
	}
};



var tzBar = {
		arr:[],//定义一个容器，装载每一个bar对象
		mw:2,/*每个一个元素的宽度*/
		init:function(){
			//获取盒子对象
			var boxDom = dom("wrapbox");
			//获取盒子对象宽度
			var bwidth = boxDom.clientWidth;
			var cells = Math.floor(bwidth / this.mw);
			boxDom.parentElement.style.width = (cells+1) * this.mw+"px";
			for(var i=0;i<=cells;i++){
				var spanDom = document.createElement("span");
				spanDom["className"] = "items";
				css(spanDom,{left:i*tzBar.mw,width:tzBar.mw-1});
				boxDom.appendChild(spanDom);
				tzBar.arr.push(spanDom);
			}
		}
	};


	var KeKeMusic = {
		mark:false,
		
		init:function(){//ie11以上的浏览器才支持 
			//1:音频上下文===html5+ajax+audioContext   html5+audio+audioContext  
			window.AudioContext = window.AudioContext || window.webkitAudioContext || window.mozAudioContext || window.msAudioContext;
			/*动画执行的兼容写法*/
			window.requestAnimationFrame = window.requestAnimationFrame || window.webkitRequestAnimationFrame || window.mozRequestAnimationFrame || window.msRequestAnimationFrame;
			//2:初始化音轨对象
			var audioContext = new window.AudioContext();
			return audioContext;
		},
		
		parse:function(audioContext,audioDom,callback){
			try{
				//拿到播放器去解析你音乐文件
				var audioBufferSouceNode = audioContext.createMediaElementSource(audioDom);
				//创建解析对象
				var analyser = audioContext.createAnalyser();
				//将source与分析器连接
				audioBufferSouceNode.connect(analyser); 
				//将分析器与destination连接，这样才能形成到达扬声器的通路
				analyser.connect(audioContext.destination);
				//调用解析音频的方法
				KeKeMusic.data(analyser,callback);
			}catch(e){
				
			}
		},
		
		data:function(analyser,callback){
			if(KeKeMusic.mark){
				//讲音频转换一个数组
				var array = new Uint8Array(analyser.frequencyBinCount);
				analyser.getByteFrequencyData(array);
				//通过回调函数返回
				if(callback)callback(array);
				requestAnimationFrame(function(){
				 	KeKeMusic.data(analyser,callback);
				});
			}
		}
	};

	window.onload = function(){
		tzBar.init();
		//点击音乐播放后触发函数
		var audioDom = dom("audio");
		var audioContext = KeKeMusic.init();
		audioDom.onplay = function(){
			KeKeMusic.mark = true;
			//获取音轨解析对象
			var len = tzBar.arr.length;
			KeKeMusic.parse(audioContext,audioDom,function(dataArr){//1024
				for(var i=0;i<len;i++){
					tzBar.arr[i].style.height = dataArr[i]+"px";
					tzBar.arr[i].style.background = "linear-gradient("+randDomColor(0.5)+"5%,rgba(0,255,0,0.5) 60%,#fff 100%)";
				}
			});
		};
		
	};