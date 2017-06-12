$(document).ready(
		function() {
			$("#txtCheckin").datepicker({
				dateFormat : "dd-M-yy",
				onSelect : function(date) {
					var date2 = $('#txtCheckin').datepicker('getDate');
					date2.setDate(date2.getDate());
					$('#txtCheckout').datepicker('setDate', date2);
					// sets minDate to dateofbirth date + 1
					$('#txtCheckout').datepicker('option', 'minDate', date2);
				}
			});
			$('#txtCheckout').datepicker(
					{
						dateFormat : "dd-M-yy",
						onClose : function() {
							var dt1 = $('#txtCheckin').datepicker('getDate');
							console.log(dt1);
							var dt2 = $('#txtCheckout').datepicker('getDate');
							if (dt2 <= dt1) {
								var minDate = $('#txtCheckout').datepicker(
										'option', 'minDate');
								$('#txtCheckout')
										.datepicker('setDate', minDate);
							}
						}
					});
		});

