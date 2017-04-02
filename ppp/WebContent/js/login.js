
$("#onebtn").bind("click",function(event){
    $("#login1").slideToggle();
    $("#login2").hide();
    $("h4").html("员工登陆");

})

$("#twobtn").bind("click",function(event){
    $("#login2").slideToggle();
    $("#login1").hide();
    $("h4").html("资料管理员");

})
