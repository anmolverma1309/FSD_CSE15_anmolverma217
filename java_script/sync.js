function register(){
    waitforseconds(5000);
    console.log("register here")
}
function login(){
    waitforseconds(10000);
    console.log("login here")
}
function getData(){
    waitforseconds(6000);
    console.log("Fetch Data")
}
function displayData(){
    waitforseconds(8000);
    console.log("view user Data")
}
function waitforseconds(delay){
const mt=Date.now()+delay;
while(Date.now()<mt)
{
    
}
}
register();
login();
getData();
displayData();
console.log("Call Another Application")