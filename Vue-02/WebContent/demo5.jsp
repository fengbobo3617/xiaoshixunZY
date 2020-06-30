<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/vue.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>组件通信</title>
</head>
<body>
<!-- //按循序执行 -->
	<div id="add">
		<counter :title="msg"></counter>
	</div>
	
	
</body>
		<script type="text/javascript">
		/* Vue.component("counter",{
			template:'<button></button'
		}) */
		//全局
		 Vue.component("counter",{
			template:'<h1>{{title}}</h1>',
			props: ['title']
			
			})
			
		
		/* 创建vue实例 */
			var add=new Vue({
				el:'#add',
				data:{
				msg:'刘德华'
					
				}
				
			});
		</script>
		<!--  <script type="text/javascript">
			/* 创建vue实例 */
			var adds=new Vue({
				el:'#adds',
				data:{
					/* key和value形式 */
					hobby:[]
				}
			});
		</script> -->
</html>