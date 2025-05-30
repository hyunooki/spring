<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<%@ include file="/WEB-INF/views/includes/header.jsp" %>
 <div class="row">
   <div class="col-lg-12 w-75 ms-3">
   <div class="panel panel-info">
	   <div class="panel-heading">Board Register</div>
	   <div class="panel-body">
	     <form role="form" action="/springTemplate/board/register" method="post">
	        <div class="form-group">
	           <label>Title</label>
	           <input class="form-control" name="title">
	        </div>
	        <div class="form-group">
	           <label>text area</label>
	           <textarea class="form-control" rows=3 name="content"> </textarea>
	        </div>
	        <div class="form-group">
	           <label>Writer</label>
	           <input class="form-control" name="writer">
	        </div>
	        <div class="text-center mt-3">
	        <button type="submit" class="btn btn-primary">Submit</button>
	        <button type="reset" class="btn btn-danger">reset</button>
	        </div>
	     </form>
	    
	   </div>
	</div>
   </div>
</div>
<%@ include file="/WEB-INF/views/includes/footer.jsp" %>
</html>