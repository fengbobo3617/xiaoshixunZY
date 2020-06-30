<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/vue.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>事件处理</title>
</head>
<body>
<!-- //按循序执行 -->
	<div id="add">
		{{name}}<br>
		请输入:<input type="text" value="" v-model="num"><br>
		张三有{{num}}箱人民币<br>
		第一种点击事件:<button v-on:click="num++" >点击</button><br>
		第二种点击事件:<button @click="add" >添加</button><br>
		第三种点击事件:<button @click="dele" >减少</button><br>
	</div>
	
</body>
		<script type="text/javascript">
			/* 创建vue实例 */
			var a=new vue({
				
				
			});
			var add=new Vue({
				el:'#add',
				data:{
					/* key和value形式 */
					name:'大哥',
					num:100
				},
				//methods 代表VUE函数书写得位置
			methods:{
				//添加方法
				add:function(){
					this.num++;
				},
				dele:function(){
					this.num--;
				}
			},
			created:{
				
			}
			
			});
			
		</script>
</html>