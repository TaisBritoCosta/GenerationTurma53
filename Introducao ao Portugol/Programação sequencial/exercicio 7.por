programa
{
	
	funcao inicio()
	{
	inteiro altura,base, area
	
    	/*Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.*/

     
		escreva("\nDigite um valor para a base e  um triângulo : \n")
		leia(base)

		escreva("\nDigite um valor para a altura de um triângulo: \n")
		leia(altura)
		
          se(base < 0 ou altura < 0){
          escreva("Os valores são negativos")
         	}
         	
        se(base > 0 ou altura >0 )
	   escreva("A area do triângulo é : ", (base*altura /2 ))
	}



         	
         	}
         	
		

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 402; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */