<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ include file="/WEB-INF/views/includes/header.jsp" %>
<h3>게시글목록</h3>
<a href="register">등록</a>
 <div class="row">
   <div class="col-lg-12">
   <div class="panel panel-info">
     <div class="panel-heading">Board List Page</div>
      <div class="panel-body">
        <table class="table table-striped table-bordered table-hover text-center ">
          <thead>
             <tr>
               <th>사원번호</th>
               <th>성</th>
               <th>이름</th>
               <th>이메일</th>
               <th>입사일자</th>
             </tr>
          </thead>
          <c:forEach items="${emp }" var="item">
        	<tr>
        	   <td>${item.employeeId }</td>
        	   <td>${item.firstName}</td>
        	   <td>${item.lastName}</td>
        	   <td>${item.email}</td>
        	   <td><fmt:formatDate pattern="yyyy-MM-dd" value="${item.hireDate}"/></td>
        	</tr>
        </c:forEach>
        </table>
			</div>
      </div>
   </div>
 </div>