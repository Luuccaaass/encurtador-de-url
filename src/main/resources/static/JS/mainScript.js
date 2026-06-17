function enviar (){
    link = document.getElementById("input").value;
}


async function encurtar() {

    const url = document.getElementById("input").value;

    const resposta = await fetch('/api/shortenlink', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            url: url,
            hoje: 'dia 11',
            vontade: 0
        })
    });
    const resultado = await resposta.text();

    alert(resultado);
}