<script>
	import Hijo from './Hijo.svelte'
	let name;

	let contador = 0;
	function incrementar(){
		contador = contador + 1;
	}

	let nombre;

	function saludar(){
		alert(`hola ${nombre ? nombre : "hola nulo"}`);
	}

</script>

<main>
	<p>hello hello {name}!</p>
	<p>Visit the <a href="https://svelte.dev/tutorial">Svelte tutorial</a> to learn how to build Svelte apps.</p>

	<h1>Contar:{contador}</h1>
	<button on:click={incrementar}>Sumar ++</button>

	<Hijo texto="Guardar"></Hijo>
	<Hijo texto="Borrar" color="red"></Hijo>

	<input type="text" placeholder="Tu nombre" bin:value={nombre}>
	<button on:click={saludar}>Saludar</button>
</main>

<style>
	main {
		text-align: center;
		padding: 1em;
		max-width: 240px;
		margin: 0 auto;
	}

	h1 {
		color: #ff3e00;
		text-transform: uppercase;
		font-size: 4em;
		font-weight: 100;
	}

	@media (min-width: 640px) {
		main {
			max-width: none;
		}
	}
</style>