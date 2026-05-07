class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        elements = set()
        for x in nums:
            if x in elements:
                return True
            else:
                elements.add(x)
        return False
        