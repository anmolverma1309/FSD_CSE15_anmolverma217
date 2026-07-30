#include <iostream>
using namespace std;
int binarySearch(int arr[], int low, int high, int target) {
    if (low > high)
        return -1;
    int mid = low + (high - low) / 2;
    if (arr[mid] == target)
        return mid;
    if (target < arr[mid])
        return binarySearch(arr, low, mid - 1, target);
    return binarySearch(arr, mid + 1, high, target);
}

int main() {
    int arr[] = {10, 20, 30, 40, 50, 60, 70};
    int n = sizeof(arr) / sizeof(arr[0]);
    int index = binarySearch(arr, 0, n - 1, 50);
    if (index != -1)
        cout << "Found at index " << index;
    else
        cout << "Not found";
    return 0;
}