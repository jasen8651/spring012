function init(chk){
	console.log("init chk=>"+chk);
	
	if(chk){
		$('#loginpage').removeClass('hidePage').addClass('showPage');
		$('#logoutpage').removeClass('showPage').addClass('hidePage');
	}else{
		$('#loginpage').removeClass('showPage').addClass('heidPage');
		$('#logoutpage').removeClass('heidPage').addClass('showPage');
	}
}
