programa
{
	
	funcao inicio()
	{
		
          inteiro notas [5],x ,maiorP=0

          para(x=0 ;x<5 ;x++)
          {
          escreva("\nDigite suas pontuações: ",(x+1), "notas ")
          leia(notas[x])
          
          se(notas [x] > maiorP){
          maiorP = notas [x]
          	
         	}
          	
          	}


          escreva("\nA pontuação maior é ", + maiorP)	
          
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 169; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */