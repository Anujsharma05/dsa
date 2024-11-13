package problems;

import java.util.Arrays;

/**
 * (0,0) -> airport
 * (n-1, n-1) -> railway station
 */
public class TaxiMaxPassengers {

  public static void main(String[] args) {
    int n = 3;

//    int[][] grid = new int[n][n];

    int[][] grid = {
        {0, 1, -1},
        {1, 0, -1},
        {1, 1, 1}
    };

    int maxPassengers = findMaxPassengers(grid);
    System.out.println(Arrays.deepToString(grid));
  }

  static int findMaxPassengers(int[][] grid) {
    airportToRailwayStation(grid,"", 0,0, 0);
    return -1;
  }

  static void airportToRailwayStation(int[][] grid, String path, int row, int col, int count) {

    if(row == grid.length-1 && col == grid.length-1) {
      railwayStationToAirport(grid, path, row, col, count);
      return;
    }

    //obstacle
    if(grid[row][col] == -1) return;

    boolean hasPassenger = false;

    //increment passenger count and making cell as traversed
    if(grid[row][col] == 1) {
      count = count + 1;
      grid[row][col] = 0;
      hasPassenger = true;
    }

    //go down
    if(row < grid.length-1) {
      airportToRailwayStation(grid, path.concat(getCell(row, col)), row+1, col, count);
    }
    //go right
    if(col < grid.length-1) {
      airportToRailwayStation(grid, path.concat(getCell(row, col)), row, col+1, count);
    }

    //reverting value when backtracking
    if(hasPassenger) {
      grid[row][col] = 1;
    }
  }

  static void railwayStationToAirport(int[][] grid, String path, int row, int col, int count) {

    if(row == 0 && col == 0) {
      path = path.concat(getCell(row, col));
      System.out.println("Count:" + count);
      System.out.println(path);
    }

    if(grid[row][col] == -1) return;

    boolean hasPassenger = false;

    if(grid[row][col] == 1) {
      count = count + 1;
      grid[row][col] = 0;
      hasPassenger = true;
    }

    //go up
    if(row > 0) {
      railwayStationToAirport(grid, path.concat(getCell(row, col)), row-1, col, count);
    }
    //go left
    if(col > 0) {
      railwayStationToAirport(grid, path.concat(getCell(row, col)), row, col-1, count);
    }

    if(hasPassenger) {
      grid[row][col] = 1;
    }
  }

  static String getCell(int row, int col) {
    return String.format("(%d,%d)", row, col);
  }



  public static void setObstruction(int[][] grid, int row, int col) {
    grid[row][col] = -1;
  }
}
