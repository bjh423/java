function 로그인() {
	id2 = 'root';
	id = prompt('아이디 입력')
	if (id == id2) {
		alert('성공')
	} else {
		alert('실패')

	}
}

function 비교() {
	n1 = 100
	n2 = 200
	
	if (n1==n2) {
		alert('동일')
	} else {
		alert('다름')
	}
	
	f1 = prompt('기분1')
	f2 = prompt('기분2')
	if (f1==f2) {
		alert('같다')
	} else {
		alert('다르다')
	}
	
}