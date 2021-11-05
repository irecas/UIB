function V = vandermonde_matrix_generator(c)
  
  n = length(c);
  V = zeros(n,n);
  
  for j = 1:n       
    for i = 1:n
      V(i,j) = c(i)**(n-j);
    endfor
  endfor
  
endfunction