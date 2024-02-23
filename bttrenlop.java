import java.util.Scanner;

public class bttrenlop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang cua mang:");
        int row = sc.nextInt();
        System.out.println("Nhap so cot cua mang:");
        int colums = sc.nextInt();
        int[][] matrix = new int[row][colums];
        do {
            System.out.println("""
                    ===========MENU==========
                        1. Nhập vào giá trị các phần tử mảng\s
                        2. In ra các phần tử mảng\s
                        3. Hiển thị dưới dạng ma trận\s
                        4. In ra đường chéo chính
                        5. In ra Đường chéo phụ\s
                        6. In ra đường biên\s
                        7. Thoát chường trình\s                       
                    """);
            System.out.println("Moi ban chon:");
            byte chose = sc.nextByte();
            switch (chose) {
                case 1:
                    System.out.println("Nhap cac phan tu cua mang: ");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.printf("[%d][%d] = ", i, j);
                            matrix[i][j] = sc.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Cac phan tu cua mang la:");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.print(matrix[i][j] + "\t");
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Cac phan tu cua mang theo ma tran la:");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.print(matrix[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Duong cheo chinh la:");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if (i == j) {
                                System.out.print(matrix[i][j] + "\t");
                            } else {
                                System.out.print("\t");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("duong cheo phu la:");
                    if (row == colums) {
                        for (int i = 0; i < matrix.length; i++) {
                            for (int j = 0; j < matrix[i].length; j++) {
                                if (j == matrix.length - i - 1) {
                                    System.out.print(matrix[i][j] + "\t");
                                } else {
                                    System.out.print("\t");
                                }
                            }
                        }
                        System.out.println();
                    }else {
                        System.out.println("Khong co duong cheo phu");
                    }
                    break;
                case 6:
                    System.out.println("Duong bien cua ma tran");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if (i == 0 || i == matrix.length - 1) {
                                System.out.print(matrix[i][j] + "\t");
                            } else if (j == 0 || j == matrix[j].length - 1) {
                                System.out.print(matrix[i][j] + "\t");
                            } else {
                                System.out.print("\t");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("誤りがありましたので１から７まで入力してください！");
            }
        } while (true);
    }
}
