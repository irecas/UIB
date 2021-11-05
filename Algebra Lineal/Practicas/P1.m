A = [4 -1 0 -1; -1 4 -1 0; -1 0 -1 4; 0 -1 4 -1];
b = [25; 15; 35; 25];

disp("Gauss solver")
[A_triu, b_triu] = gauss_solver(A, b);
#disp(A_triu);
#disp(b_triu);
solution = inv (A_triu) * b_triu;
disp(solution);

disp("Metodo matriz inversa");
disp (inv (A) * b);


disp("Metodo triangular suoerior");
solution = gauss_upper_triangular_solver(A_triu, b_triu);
disp(solution);


disp("Gauss maximal pivoting solver");
[A_max, b_max, permutation] = gauss_maximal_pivoting_solver(A, b);
sol_maxp_unord=gauss_upper_triangular_solver(A_max, b_max);
sol_maxp=reorder_solution(sol_pmax_unord, permutation);

disp("--unordered sol--");
disp( sol_maxp_unord);
disp("--ordered sol--");
disp( sol_maxp);
