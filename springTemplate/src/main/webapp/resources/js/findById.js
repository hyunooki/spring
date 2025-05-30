/**
 * 
 */

function read(){
fetch('/springTemplate/board/5/replies?page=1')
  .then((response) => response.json())
  .then((json) => console.log(json));
}
function register(data){
fetch('/springTemplate/board/5/replies', {
  method: 'POST',
  body: JSON.stringify(data),
  headers: {
    'Content-type': 'application/json; charset=UTF-8',
  },
})
  .then((response) => response.json())
  .then((json) => console.log(json));
}