/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start



class Solution {
    public int findKthLargest(int[] nums, int k) {
        // k < 1 veya dizi null ise 0 döndürülür.
        if (k < 1 || nums == null) {
            return 0;  
        }

        // QuickSelect algoritması
        return getKth(nums.length - k + 1, nums, 0, nums.length - 1);
    }

    public int getKth(int k, int[] nums, int start, int end) {
        int pivot = nums[end];  // Pivot olarak son eleman seçilir.
        int left = start;
        int right = end;

        while (true) {
            // Pivot'tan küçük tüm elemanları sol tarafa taşınır.
            while (nums[left] < pivot && left < right) {
                left++;
            }

            // Pivot'tan büyük veya eşit tüm elemanları sağ tarafa taşınır.
            while (nums[right] >= pivot && right > left) {
                right--;
            }
            // İki indeks çakıştığında döngüyü sonlanır.
            if (left == right) {
                break;  
            }
            // Sağ ve sol indekslerin değerleri çevrilir.
            swap(nums, left, right);  
        }
        // Pivot elemanını doğru konuma taşıyoruz
        swap(nums, left, end);  

        // Bulunan pivot konumu ve k'ncı konumu karşılaştırılır.
        if (k == left + 1) {
            return pivot;  
        } else if (k < left + 1) {
            // Eğer k'ncı konum pivot'tan küçükse sol alt dizide aranır.
            return getKth(k, nums, start, left - 1);
        } else {
            // Eğer k'ncı konum pivot'tan büyükse sağ alt dizide aranır.
            return getKth(k, nums, left + 1, end);
        }
    }

    // Dizide iki elemanın yerini değiştiren fonksiyon
    void swap(int[] nums, int n1, int n2) {
        int tmp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = tmp;
    }
    
    
}
// @lc code=end

