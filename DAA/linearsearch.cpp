#include <iostream>
using namespace std;
int linearSearch(int arr[], int n, int i, int target) {
    if (i == n)
        return -1;
    if (arr[i] == target)
        return i;
    return linearSearch(arr, n, i + 1, target);
}

int main() {
    int arr[] = {10, 20, 30, 40, 50};
    int n = sizeof(arr) / sizeof(arr[0]);
    int index = linearSearch(arr, n, 0, 40);
    if (index != -1)
        cout << "Found at index " << index;
    else
        cout << "Not found";
    return 0;
}