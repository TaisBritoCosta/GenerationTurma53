programa
{
	
	funcao inicio()
	{

          inteiro idade 
          inteiro resultadoFinal
          inteiro anos
          inteiro meses
          inteiro dias 
          
		escreva("Mostre quantos dias voce tem ?")
		leia(dias)
		

		// O ano tem 365 dias 
		// O mes tem 30 dias 
		

		anos = dias / 365 
		meses = (dias % 365) / 30
          dias = (dias % 365) % 30

          escreva("Voce tem: ",anos ,"anos\n")
          escreva("Voce tem: ", meses ,"meses\n")
          escreva("Voce tem: ", dias , "dias\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 510; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */