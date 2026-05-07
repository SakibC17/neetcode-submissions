class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numbers = {}
        for i,x in enumerate(nums):
            difference = target - x
            if difference in numbers:
                return [numbers[difference], i]
            numbers[x] = i