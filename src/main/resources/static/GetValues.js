let baseUrl = "http://localhost:9595/product/";


function Calc(url, callback){
	let xhr= new XMLHttpRequest();
	xhr.open("GET",url);
	xhr.onreadystatechange = function(){
		if(this.readyState === 4 && this.status===200){
			callback(this);
		}else{
			console.log(xhr.response);
		}
	}
	xhr.send();
}
function popCalc(){
	let input = document.getElementById("calc").value;
	Calc(baseUrl+input,displayCalc)
	console.log(input);
}

function displayCalc(xhr){
	let calculations = JSON.parse(xhr.response);
	document.getElementById("display").innerHTML = calculations
}

document.getElementById("popCalc").addEventListener("click",popCalc);