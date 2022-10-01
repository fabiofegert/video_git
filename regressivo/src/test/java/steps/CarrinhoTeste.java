package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class CarrinhoTeste {

	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();

	@Given("selecione o tamanho")
	public void selecione_o_tamanho() {
		metodos.abrirNavegador();
	}

	@Given("selecionar o produto")
	public void selecionar_o_produto() {
		metodos.pausa(3000);
		metodos.clicar(elementos.firstProduct);
	}

	@When("adicionar ao carrinho")
	public void adicionar_ao_carrinho() {
		metodos.clicar(elementos.btnCheckout);
	}

	@Then("validar informacoes")
	public void validar_informacoes() {
		metodos.validarAlert("Checkout - Subtotal: $ 10.90");
		metodos.fecharNavegador();
	}

}
