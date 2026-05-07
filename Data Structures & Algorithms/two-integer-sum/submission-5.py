class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numbers = {}
        pair = []
        for i,x in enumerate(nums):
            difference = target - x
            if difference in numbers:
                pair.append(numbers[difference])
                pair.append(i) 
            numbers[x] = i
        return pair