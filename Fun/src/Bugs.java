
// int[][] matrix = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9}};
//
//  matrix.length = 3
// 	.................
//  : 0 : 1 : 2 : 3 : matrix[0].length = 3
//  : 4 : 5 : 6 : 7 : matrix[1].length = 3
//  : 8 : 9 :'''''''' matrix[2].length = 2
// 	'''''''''
//
// matrix > matrix[0] > matrix[0][0]
//					  > matrix[0][1]
//					  > matrix[0][2]
//					  > matrix[0][3]
//		  > matrix[1] > matrix[1][0]
//					  > matrix[1][1]
//					  > matrix[1][2]
//				      > matrix[1][3]
//		  > matrix[2] > matrix[2][0]
// 					  > matrix[2][1]
// 
// 3 > 4 > 1
//		 > 1
//	     > 1
// 		 > 1
//	 > 4 > 1
//		 > 1
//		 > 1
//		 > 1
//   > 2 > 1
//		 > 1
