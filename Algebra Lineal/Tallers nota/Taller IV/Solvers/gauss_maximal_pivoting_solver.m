function [A,b,permmutation] = gauss_maximal_pivoting_solver(A,b)
n=length(b);
mat=[A b];

for i=1:n
    permmutation(i,1)=i;
endfor

for c=1:n-1
    mayor=abs(mat(c,c));
    fm=c;
    cm=c;
    for f=c:n
        for j=c:n
            if abs(mat(f,j))>mayor
                mayor=abs(mat(f,j));
                fm=f;
                cm=j;    
            endif
        endfor
    endfor
       
    if fm~=c
        aux=mat(fm,:);
        mat(fm,:)=mat(c,:);
        mat(c,:)=aux;
    endif
    
    if cm~=c
        aux=mat(:,cm);
        mat(:,cm)=mat(:,c);
        mat(:,c)=aux;
        aux=permmutation(cm,1);
        permmutation(cm,1)=permmutation(c,1);
        permmutation(c,1)=aux;
    endif
    
    for f=c+1:n
        multiplicador=mat(f,c)/mat(c,c);
        for i=1:n+1
            mat(f,i)=mat(f,i)-multiplicador*mat(c,i);
        endfor
    endfor
endfor

A=mat(:,1:n);   #Asigna a la matriz A la matriz de coeficientes
b=mat(:,n+1);   #Asigna a la matriz B el termino independiente

%disp("matriu completa")
%disp (mat);
%disp("A");
%disp(A);
%disp("b");
%disp(b);
endfunction