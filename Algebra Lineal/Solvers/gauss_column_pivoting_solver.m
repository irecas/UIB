function [A, b] = gauss_column_pivoting_solver(A, b)
 n=length(b);
 
 for k=1:n-1
   mx=k;
  for i=k+1:n
    if (abs(A(i,k)) > abs(A(mx,k)))  
      mx = i;
    endif
   endfor
   if (A(mx, k) == 0)
     m=1;
   
   else
     #Intercanvi files i columnes
      C=A(k,:);
      bb=b(k);
      A(k,:)=A(mx,:);
      A(mx,:)=C;
      b(k)=b(mx);
      b(mx)=bb;
     # Acabam de fer l'intercanvi
     
     for i=k+1:n
       m=A(i,k)/A(k,k);
       A(i,k)=0;
       for j=k+1:n
         A(i,j)=A(i,j)-m*A(k,j);
       endfor
       b(i)=b(i)-m*b(k);
     endfor
   endif
  endfor
endfunction
