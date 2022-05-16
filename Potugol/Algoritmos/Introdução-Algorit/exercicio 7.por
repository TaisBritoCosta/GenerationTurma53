programa
{
	
	funcao inicio()
	{

          /*a.x + b.y = c
           d.x + e.y = f
           x = (c.e - b.f)/(a.e - b.d)
           y = (a.f - c.d)/(a.e - b.d)*/

           inteiro a,b,c,d,E,f,x,y
	 
           escreva("Valores para a,b,c,d,E,F:\n")
           leia(a,b,c,d,E,f)
           limpa()

           x = (c*E - b*f) / (a*E - b*d)
           y = (a*f - c*d) / (a*E - b*d)

          escreva("X= ",x," e Y= ",y)
          
		
	}
	 



}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 439; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */