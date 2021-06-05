<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ include page="/menuBar.jsp" %> --%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>메인</title>
		<style type="text/css">
			#topMY {
				fill: transparent;
				stroke: rgba(26,24,24,1);
				stroke-width: 2px;
				stroke-linejoin: miter;
				stroke-linecap: butt;
				stroke-miterlimit: 10;
				shape-rendering: auto;
			}
			.topMY {
				cursor: pointer;
				overflow: visible;
				position: absolute;
				width: 32px;
				height: 34px;
				left: 1636px;
				top: 40px;
				transform: matrix(1,0,0,1,0,0);
			}
		</style>
		 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		  <script>
		    function checkLoginStatus(){		// 로그인인지 아닌지 확인
		      var loginBtn = document.querySelector('#loginBtn');
		      var nameTxt = document.querySelector('#name');
		      if(gauth.isSignedIn.get()){		// gauth.isSignedIn.get()   -> 로그인이 되어 있는지 아닌지 확인 
		        console.log('logined');
		        loginBtn.value = 'Logout';
		        var profile = gauth.currentUser.get().getBasicProfile();		// 현제 로그인 사용자 정보를 가져오기
		        console.log(profile);
		        nameTxt.innerHTML = 'Welcome <strong>'+profile.getName()+'</strong> ';
		      } else {
		        console.log('logouted');
		        loginBtn.value = 'Login';
		        nameTxt.innerHTML = '';
		      }
		    }
		    
		    function init(){		// oauth 초기화
		      gapi.load('auth2', function() {
		        window.gauth = gapi.auth2.init({			// gauth -> Google Aouth 객체
		          client_id:'252752654293-i7gcem9dmuf4m3c5836rsrb2sp7mkh74.apps.googleusercontent.com'
		        })
		        gauth.then(function(){
		          checkLoginStatus();
		        }, function(){
		          console.log('googleAuth fail');
		        });
		      });
		    }
		  </script>
	</head>
<<<<<<< HEAD
	<body>  
		<span id="name"></span> 
		<button id="loginBtn" onclick="
			if(this.value === 'Login'){
			      gauth.signIn({
			        scope:'https://www.googleapis.com/auth/calendar'
			      }).then(function(){
			        checkLoginStatus();	
			      });
			    } else {
			      gauth.signOut().then(function(){
			        checkLoginStatus();
			      });
			    }
	    "><svg class="topMY" viewBox="61.076 32.612 30 32">
				<path id="topMY" d="M 83.69393920898438 47.11613464355469 C 84.70953369140625 45.61999893188477 85.30586242675781 43.79904937744141 85.30586242675781 41.83426666259766 C 85.30586242675781 36.74092864990234 81.30147552490234 32.61199951171875 76.36181640625 32.61199951171875 C 71.42215728759766 32.61199951171875 67.41777801513672 36.74092864990234 67.41777801513672 41.83426666259766 C 67.41777801513672 43.70920181274414 67.96092224121094 45.4531135559082 68.89311981201172 46.9088134765625 C 64.23535919189453 49.04409408569336 61.07599639892578 54.56227111816406 61.07599639892578 59.32867050170898 C 61.07599639892578 66.27806854248047 91.07599639892578 66.41953277587891 91.07599639892578 59.47016906738281 C 91.07599639892578 54.85367965698242 88.11231231689453 49.30550384521484 83.69393920898438 47.11613464355469 Z">
				</path>
			</svg>
		</button>
		<!-- <input type="button" id="loginBtn" onclick="
			    if(this.value === 'Login'){
			      gauth.signIn({
			        scope:'https://www.googleapis.com/auth/calendar'
			      }).then(function(){
			        checkLoginStatus();	
			      });
			    } else {
			      gauth.signOut().then(function(){
			        checkLoginStatus();
			      });
			    }
		  	"> -->
		  		
	      <c:forEach items="${productlist }" var="p">
	      [${p.category }]
	      	<a href="BuyProduct?seq=${p.seq }">
	      		 ${p.title } &nbsp;${p.price}원
		    </a><br/>	   
=======
	<body>
		
	      <c:forEach items="${productlist }" var="product">
	      	<a href="BuyProduct.jsp?seq=${product.seq }">	
	      	[${product.category }] &nbsp; ${product.title } &nbsp; ${product.price }<br>
	      	</a>  
>>>>>>> branch 'develop' of https://github.com/terysol/Mirim_Market.git
	      </c:forEach>
	      
	      <a href="Registration">상품등록 </a>
		 
	  	<script src="https://apis.google.com/js/platform.js?onload=init" async defer></script>
	</body>
</html>