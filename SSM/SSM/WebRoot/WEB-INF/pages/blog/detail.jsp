<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../common/taglib.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>${blog.title}</title>
		<%@include file="../common/common.jsp" %>
		<script type="text/javascript" src="${basePath}/resource/js/keke_music.js" ></script>
		<script type="text/javascript" src="${basePath}/resource/js/keke_play.js" ></script>
	</head>
	<body style="background:url(${basePath}/resource/images/bg2.jpg)">
		<!--头部-->
		<%@include file="../common/header.jsp" %>
		<!-- 内容区 -->
		<div class="container">
			<div class="mbox">
				<img src="${basePath}/${blog.img}"  width="956" height="350"/>
				<div class="p_over"></div>
				<div class="tit_over">
					<h1><i class="iconfont icon-music fz32" style="display:inline-block"></i>${blog.title}</h1>
					<p>2${blog.createTime} @${blog.username} 
						<span id="time">${blog.musictime}</span>/<span id="ptime">00:00</span>
						<span id="percent">0%</span>
					</p>
					<a href="javascript:void(0);" class="ke_op"><i class="iconfont icon-play fz64"></i></a>
					<!-- 音轨的盒子 -->
					<div id="wrapbox"></div>
				</div>
			</div>
		
			<div class="content mt28">
				${blog.description}
				<audio src="${basePath}/${blog.musiclink}" id="audio" ></audio>
			</div> 
			
			<div class="relation">
				<h1><i class="iconfont icon-star fz32"></i>相似主题</h1>
				<ul>
					<li><a href="#"><img src="http://7xkszy.com2.z0.glb.qiniucdn.com/pics/albums/9912/cover.jpg" alt="" /></a></li>
					<li><a href="#"><img src="http://7xkszy.com2.z0.glb.qiniucdn.com/pics/albums/9913/cover.jpg" alt="" /></a></li>
					<li><a href="#"><img src="http://7xkszy.com2.z0.glb.qiniucdn.com/pics/albums/9914/cover.jpg" alt="" /></a></li>
					<li><a href="#"><img src="http://7xkszy.com2.z0.glb.qiniucdn.com/pics/albums/9915/cover.jpg" alt="" /></a></li>
				</ul>
			</div>

			<div class="clearfix"></div>
			<div id="comments">
				<div class="areabox">
					<textarea id="comcnt" placeholder="请输入你要讲评论..."></textarea>
					<div class="subtn"><a href="#" class="fr"><i class="iconfont icon-star"></i>发表言论</a></div>
				</div>
				<hr/>
				<div class="commentbox">
						<a id="comment-5722"></a>
						<div class="comment" >
							<ul class="links inline">
								<li class="comment-reply first last"><a href="/comment/reply/3420/5722">回复</a></li>
							</ul>
							<div class="submitted"> <span rel="sioc:has_creator"><a href="/user/37980" title="查看用户资料" class="username" >kingsley</a></span> <span class="marker">member</span> </div>
							<div class="content">
								<span rel="sioc:reply_of" resource="/blog/3420" class="rdf-meta element-hidden"></span> 我非常羡慕和向往你这样热爱生活的自由创业者。
								<p class="submitted"><span>2 个月 1 周 以前</span></p>
							</div>
						</div>
						
					</div>
			</div>
			<!--ie678不支持--->
		</div>
		<!-- end 内容区 -->
		
		
		<!--底部-->
		<%@include file="../common/footer.jsp" %>
	
		<script type="text/javascript">
			
			/*损坏图片的处理方案*/
			$(function(){
				$("img").on("error",function(){
					$(this).attr("src",basePath+"/resource/images/noimage.gif");
				});
			});
		</script>
	</body>
</html>