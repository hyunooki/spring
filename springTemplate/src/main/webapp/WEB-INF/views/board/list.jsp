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
               <th>#번호</th>
               <th>제목</th>
               <th>작성자</th>
               <th>작성일</th>
               <th>수정일</th>
             </tr>
          </thead>
          <c:forEach items="${list }" var="board">
        	<tr data-attribute="${board.bno}">
        	   <td>${board.bno }</td>
        	   <td><a href="findById?bno=${board.bno }">${board.title }</a></td>
        	   <td>${board.writer }</td>
        	   <td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.regdate }"/></td>
        	   <td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.updatedate }"/></td>
        	</tr>
        </c:forEach>
        </table>
				<form id="searchForm" action="/springTemplate/board/list" method="get">
					<select name="type">
						<option value="">--</option>
						<option value="T">제목</option>
						<option value="C">내용</option>
						<option value="W">작성자</option>
						<option value="TC">제목 or 내용</option>
						<option value="TW">제목 or 작성자</option>
						<option value="TWC">제목 or 내용 or 작성자</option>
					</select> <input type="text" name="keyword" value="${pageMaker.cri.keyword}" />

					<button class="btn btn-outline-primary">Search</button>

					<input type="hidden" name="pageNum"
						value=1 /> <input type="hidden"
						name="amount" value=10 />
				</form>
				<nav aria-label="Page navigation example">
					<ul class="pagination">
						<c:if test="${pageMaker.prev}">
							<li class="page-item previous"><a class="page-link"
								href="${pageMaker.startPage -1}">Previous</a></li>
						</c:if>

						<c:forEach var="num" begin="${pageMaker.startPage}"
							end="${pageMaker.endPage}">
							<li class="page-item  ${pageMaker.cri.pageNum == num ? "active":""} ">
								<a class="page-link" href="${num}">${num}</a>
							</li>
						</c:forEach>

						<c:if test="${pageMaker.next}">
							<li class="page-item next"><a class="page-link"
								href="${pageMaker.endPage +1 }">Next</a></li>
						</c:if>
					</ul>
				</nav>
			</div>
      </div>
   </div>
 </div>
  <div class="modal" tabindex="-1" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title">Modal title</h5>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
          <p>등록이 완료되었습니다.</p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
          <button type="button" class="btn btn-primary">Save changes</button>
        </div>
      </div>
    </div>
  </div>
 <%@ include file="/WEB-INF/views/includes/footer.jsp" %>
<script type="text/javascript">
   
   
 $(document).ready(function () {
	 document.querySelectorAll('table tbody tr').forEach((ele) => {
		   ele.addEventListener('click',function(e){
			   let bno = ele.getAttribute("data-attribute");
			   location.href = 'findById?bno='+bno
					   
			   console.log(ele.getAttribute("data-attribute"))
		   })
	   })
	   
    var result = "${result}";
    checkModal(result);
    $(['name=type']).val('${pageMaker.cri.type}');
    let searchForm =$("#searchForm");
    /* ---------------
    	모달창 띄우기
    ----------------*/
    function checkModal(result) {
      if (result === "") {
        return;
      }

      if (parseInt(result) > 0) {
        $(".modal-body").html(
          "게시글 " + parseInt(result) + " 번이 등록되었습니다."
        );
      }

      const options = { backdrop: false, focus: true, keyboard: true };
      const myModal = document.getElementById("myModal");
      const myModalAlternative = new bootstrap.Modal("#myModal", options);
      myModalAlternative.show(myModal);
    }
   	/* ---------------
    	검색 클릭 이벤트 
    ----------------*/
    $("#searchForm button").on("click", function (e) {
        if (!searchForm.find("option:selected").val()) {
          alert("검색종류를 선택하세요");
          return false;
        }

        if (!searchForm.find("input[name='keyword']").val()) {
          alert("키워드를 입력하세요");
          return false;
        }

        searchForm.find("input[name='pageNum']").val("1");
        e.preventDefault();
        searchForm.submit();
      });
    /* ---------------
		페이지 이동
	----------------*/

    $(".pagination a").on("click", function (e) {
        e.preventDefault();
    	searchForm.find("input[name='pageNum']").val($(this).attr("href"));
        searchForm.submit();
      });

  });
 
</script>

</html>