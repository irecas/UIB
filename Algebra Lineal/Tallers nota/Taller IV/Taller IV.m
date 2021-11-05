%%%%%%%%%%%%%%%%%%%%Taller IV%%%%%%%%%%%%%%%%%%%%
vector_inicial = [sqrt(2); 1/5; exp(1); sqrt(3); 1/7; exp(-1)];
b= [1; 1; 0; 1; 1; 0];

system_martix=vandermonde_matrix_generator(vector_inicial);

%Apartat a
[A_g, b_g]=gauss_solver(system_martix, b);
solutiona=gauss_upper_triangular_solver(A_g, b_g);
disp("-----Solucio A-----");
disp("--Matriu equivalent--");
disp(A_g);
disp("--Vector independent--");
disp(b_g);
disp("Solució");
disp(solutiona);

%Apartat b
[A_gpc, b_gpc]=gauss_column_pivoting_solver(system_martix, b);
solutionb=gauss_upper_triangular_solver(A_gpc, b_gpc);
disp("-----Solucio B-----");
disp("--Matriu equivalent--");
disp(A_gpc);
disp("--Vector independent--");
disp(b_gpc);
disp("Solució");
disp(solutionb);

%Apartat c
[A_gpm, b_gpm, permutation] = gauss_maximal_pivoting_solver(system_martix, b);
sol_gpm_unord=gauss_upper_triangular_solver(A_gpm, b_gpm);
sol_gpm=reorder_solution(sol_gpm_unord, permutation);

disp("-----Solucio C-----");
disp("--Matriu equivalent--");
disp(A_gpm);
disp("--Vector independent--");
disp(b_gpm);
disp("Solució");
disp("--solució desordenada--");
disp( sol_gpm_unord);
disp("Vector de permutació");
disp(permutation);
disp("--ordered sol--");
disp( sol_gpm);

%%Apartat d
solucio_real = [7.8393275710819351081; -48.781753980901798876; 
                102.6525034837857424; -83.507991601151912461; 
                20.471932844603298031; -0.49974471119817238753]
[abs_error_gauss, rel_error_gauss]=compute_errors(solucio_real, solutiona);
[abs_error_gpc, rel_error_gpc]=compute_errors(solucio_real, solutionb);
[abs_error_gpm, rel_error_gpm]=compute_errors(solucio_real, sol_gpm);

disp("Apartat d");
disp("Error absolut amb gauss");
disp(abs_error_gauss);
disp("Error relatiu amb gauss");
disp(rel_error_gauss);
disp("Error absolut amb gpc");
disp(abs_error_gpc);
disp("Error relatiu amb gpc");
disp(rel_error_gpc);
disp("Error absolut amb gpm");
disp(abs_error_gpm);
disp("Error relatiu amb gpm");
disp(rel_error_gpm);
