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
	v-text:<span v-text="name"></span><br>
	v-html:<span v-html="name"></span><br>
	<input type="checkbox" value="java" v-model="language">java<br>
	<input type="checkbox" value="ios" v-model="language">ios<br>
	<input type="checkbox" value="php" v-model="language">php<br>
	你选择的语言是{{language.join(",")}}<br>
	<!-- <input v-on:keyup.13="submit"><br> -->
		<div v-for="(user,index) in users" v-if="user.gender=='男'">
			{{index}}-{{user.name}}-{{user.gender}}-{{user.age}}
		</div><br>
	<div v-for="(value,key,index) in user">
	{{index}}:{{key}}:{{value}}
	</div>
	
	<button @click="show=!show">点击切换</button>
	<div v-if="show">你好</div>
	<div v-show="show">你好</div><br>
	
	{{birth}}

	
	
	</div>
	<!-- <div id="adds">

	<input type="checkbox" value="足球" v-model="hobby">足球<br>
	<input type="checkbox" value="篮球" v-model="hobby">篮球<br>
	<input type="checkbox" value="网球" v-model="hobby">网球<br>
	你的爱好是{{hobby}}
	</div> -->
	
</body>
		<script type="text/javascript">
			/* 创建vue实例 */
			var add=new Vue({
				el:'#add',
				data:{
					/* key和value形式 */
					name:'<h1>我是刘德华</h1>',
					language:[],
					users:[
						{name:'张三',gender:'男',age:12},
						{name:'李四',gender:'女',age:13},
						{name:'王五',gender:'男',age:14},
						{name:'赵六',gender:'女',age:15},
						{name:'成吉思汗',gender:'男',age:100},
					],
					user:{name:'李四',gender:'女',age:13},
					show:true,
					birthday:1529032123201 //毫秒值
					
				},
				computed:{
					birth(){// 计算属性本质是一个方法，但是必须返回结果
					const d = new Date(this.birthday);
						return d.getFullYear() + "-" + d.getMonth() + "-" + d.getDay();
					},
				/* method:{
					/* birth(){
						return new Date(this.birthday).getFullYear() + '-'+ new Date(this.birthday).getMonth()+ '-' +new Date(this.birthday).getDay()
					} */
					
				}
			
				 /* methods:{
					sumbit(){
						alert("你敲回车");
					}
				} */ 
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