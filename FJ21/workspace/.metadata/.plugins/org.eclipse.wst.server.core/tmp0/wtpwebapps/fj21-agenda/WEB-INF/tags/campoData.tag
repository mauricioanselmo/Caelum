<%@ attribute name="id" required="true" %>
<input type="text" id="${id}" name="${id}" />
<script>
	$("#${id}").datepicker({changeYear: true, dateFormat: 'dd/mm/yy', changeMonth: true, yearRange: "1900:2100"});
</script>