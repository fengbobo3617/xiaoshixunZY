<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/vue.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- //按循序执行 -->
	<div id="add">
		<input type="text" v-model="message"><br>
		<counter></counter><br>
		<counter></counter><br>
		<counter></counter><br>
	</div>
	
	
</body>
		<script type="text/javascript">
		/* Vue.component("counter",{
			template:'<button></button'
		}) */
		 Vue.component("counter",{
			template:'<button v-on:click="count++">你点了我 {{ count }} 次，我记住了.</button>',
			
			data(){
					return {
						count:0
					}
					}
			})
			
		
		/* 创建vue实例 */
			var add=new Vue({
				el:'#add',
				data:{
				message:''
					
				},
				watch:{
					message(newVal,oldVal){
						console.log(newVal,oldVal);
					}
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