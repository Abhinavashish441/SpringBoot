<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<head>
<nav class="navbar bg-body-primary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="https://d3lzcn6mbbadaf.cloudfront.net/media/details/stackroute_WLkikMF.jpg" alt="Logo" width="30" height="24" class="d-inline-block align-text-top">
        Newz Application Assignment
    </a>
  </div>
</nav>

    <meta charset="ISO-8859-1">
    <title>Newz App</title>

    <link rel="stylesheet"
    	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet"
        href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.css">
    <script
    	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script
    	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script
        src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.js"></script>

</head>
<body>

    <div class="container">

        <h1 class="p-3"> Add News </h1>

        <form:form action="/saveNews" method="post" modelAttribute="todo">
        	<div class="row">
            	<div class="form-group col-md-12">
            		<label class="col-md-3" for="id">News Id</label>
            		<div class="col-md-6">
            		    <form:input type="text" path="id" id="id"
            		        class="form-control input-sm" required="required" />
            		</div>
            	</div>
            </div>

            <div class="row">
            	<div class="form-group col-md-12">
            		<label class="col-md-3" for="title">Title</label>
            		<div class="col-md-6">
            		    <form:input type="text" path="title" id="title"
            		        class="form-control input-sm" required="required" />
            		</div>
            	</div>
            </div>

            
            
            <div class="row">
            	<div class="form-group col-md-12">
            		<label class="col-md-3" for="author">Author</label>
            		<div class="col-md-6">
            			<form:input type="text" path="author" id="author"
            				class="form-control input-sm" value="Incomplete" />
            		</div>
            	</div>
            </div>
            
            <div class="row">
            	<div class="form-group col-md-12">
            		<label class="col-md-3" for="description">Description</label>
            		<div class="col-md-6">
            			<form:input type="text" path="description" id="description"
            				class="form-control input-sm" value="Incomplete" />
            		</div>
            	</div>
            </div>
            <div class="row">
            	<div class="form-group col-md-12">
            		<label class="col-md-3" for="content">Content</label>
            		<div class="col-md-6">
            			<form:input type="text" path="content" id="content"
            				class="form-control input-sm" value="Incomplete" />
            		</div>
            	</div>
            </div>

            <div class="row p-2">
            	<div class="col-md-2">
            		<button type="submit" value="Register" class="btn btn-success">Save</button>
            	</div>
            </div>

        </form:form>

    </div>
    
    <div class="container">

        <h1 class="p-3"> News List</h1>

        <form:form>

            <table class="table table-bordered">
            	<tr>
            		<th>Id</th>
            		<th>Title</th>
            		<th>Date</th>
            		<th>Author</th>
            		<th>Description</th>
            		<th>Content</th>
            		<th>Edit</th>
            		<th>Delete</th>
            	</tr>

            	<c:forEach var="todo" items="${list}">
                    <tr>
                		<td>${todo.id}</td>
                		<td>${todo.title}</td>
                		<td>${todo.date}</td>
                		<td>${todo.author}</td>
                		<td>${todo.description}</td>
                		<td>${todo.content}</td>
                		
                		<td><button type="button" class="btn btn-primary">
                		    <a href="/editToDoItem/${todo.id}">Edit</a>
                		</button></td>
                		<td><button type="button" class="btn btn-danger">
                			<a href="/deleteToDoItem/${todo.id}">Delete</a>
                		</button></td>
                	</tr>

            	</c:forEach>

            </table>

        </form:form>

    <script th:inline="javascript">
            window.onload = function() {

                var msg = "${message}";
                console.log(msg);
                if (msg == "Save Failure") {
    				Command: toastr["error"]("Something went wrong with the save.")
    			}

    			toastr.options = {
                      "closeButton": true,
                      "debug": false,
                      "newestOnTop": false,
                      "progressBar": true,
                      "positionClass": "toast-top-right",
                      "preventDuplicates": false,
                      "showDuration": "300",
                      "hideDuration": "1000",
                      "timeOut": "5000",
                      "extendedTimeOut": "1000",
                      "showEasing": "swing",
                      "hideEasing": "linear",
                      "showMethod": "fadeIn",
                      "hideMethod": "fadeOut"
                    }
    	    }
        </script>

</body>

</html>