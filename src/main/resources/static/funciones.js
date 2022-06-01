function eliminar(id) {
	swal({
		title: "Estas seguro de eliminar?",
		icon: "warning",
		color:"red",
		buttons: true,
		dangerMode: true,
		
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url: "/comments/eliminar/" + id,
					success: function(res) {
						console.log(res);
					}
				});
				swal("Se ha eliminado coorectamente el comentario", {
					icon: "success",
				}).then((ok) => {
					if (ok) {
						location.href = "/comments";
					}
				});
			} else {
				swal("Your imaginary file is safe!");
			}
		});
}