<html>
<head>
    <script src="/res/js/jquery/jquery.js"></script>
</head>
<body>
<button onclick="submit()">测试</button>
</body>

<script>
    function submit() {
        $.ajax({
            type : "post",
            url : '${base}/user',
            dataType : "json",
            async : false,
            success : function(data) {
                console.log(data);
            }
        });
    }
</script>
</html>
