var splitValue = window.location.href;
var s = splitValue.split("=");
var actualContent = s[1].replaceAll("+", " ");

$.ajax({
	type: "POST",
	url: "/api/v1/bot/send",
	data: JSON.stringify({
		message: actualContent
	}),
	beforeSend: function(xhr) {
		$(".letToggleIt").css("display", "block");
		},
	contentType: "application/json; charset=utf-8",
	dataType: "json",
	success: function(data) {
		$('#custom-header').html(data.choices[0].text);
		$('#custom-header').css('display', 'block');
		$('.letToggleIt').css('display', 'none');
	},
	error: function(err) {		
		console.log(err);
		$('.letToggleIt').css('display', 'none');
	}
});
