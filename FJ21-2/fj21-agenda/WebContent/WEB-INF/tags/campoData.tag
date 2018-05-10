<%@ attribute name="id" required="true" %>



<input type="text" id="${id}" name="${id}" />
<script>
	$("#${id}").datepicker({changeYear:true, yearRange: "1920:2020", changeMonth: true, dateFormat: 'dd/mm/yy'});
</script>