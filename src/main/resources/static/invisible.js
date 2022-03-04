async function onSubmit(token) {
	
    console.log("TOKEN = " + token);
    alert('Obrigado ' + document.getElementById('field').value + " token gerado= " +token);
    console.log(document.getElementById('field').value);

  }

  function validate(event) {
      console.log("Evento" + event)
    event.preventDefault();
    if (!document.getElementById('field').value) {
      alert('Adicione um texto');
    } else {
		console.log("teste novo"+
		
		"-");
      hcaptcha.execute();
    }
  }

  function onload() {
	
    var element = document.getElementById('submit');
    element.onclick = validate;
  }


	
	onload();

	
	



	

