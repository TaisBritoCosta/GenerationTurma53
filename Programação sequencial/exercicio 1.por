programa
{

         inteiro P= 0, E = 0
         real M = 0.00, valorMulta = 4.00
         inteiro limite = 50

         //entrada
         
	funcao inicio()
	{
        escreva(" Qual peso dos tomates: ")
        leia(P)

      se (P>limite) {
      	//excesso
      	E = (P - limite)
      	
      	//multa
      	M = E * valorMulta
      	
      }
        escreva("Quantos kilos tem em excesso:", E,"\n")
        escreva("Valor da multa, por excesso de peso:R$ ",M)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 233; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */