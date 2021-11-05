function [abs_error_gauss, rel_error_gauss] = compute_errors(solucion_real, solucion_gauss)

  n = length(solucion_gauss);
  
  abs_error_gauss = zeros(n, 1);
  rel_error_gauss = zeros(n, 1);
  
  for i = 1 : n
    sol = solucion_gauss(i);
    real_sol = solucion_real(i);
    
    abs_error_gauss(i) = abs(real_sol - sol);
    rel_error_gauss(i) = abs_error_gauss(i) / abs(real_sol);
  endfor
  
endfunction