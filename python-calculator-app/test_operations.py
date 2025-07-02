# test_operations.py

import unittest
import operations
import numpy as np

class TestOperations(unittest.TestCase):

    def test_add(self):
        self.assertEqual(operations.add(10, 5), np.add(10, 5))
        self.assertEqual(operations.add(-3, 7), np.add(-3, 7))

    def test_subtract(self):
        self.assertEqual(operations.subtract(10, 5), np.subtract(10, 5))
        self.assertEqual(operations.subtract(-3, -2), np.subtract(-3, -2))

    def test_multiply(self):
        self.assertEqual(operations.multiply(6, 7), np.multiply(6, 7))
        self.assertEqual(operations.multiply(-2, 4), np.multiply(-2, 4))

    def test_divide(self):
        self.assertAlmostEqual(operations.divide(10, 2), np.divide(10, 2))
        self.assertAlmostEqual(operations.divide(-15, 3), np.divide(-15, 3))

    def test_divide_by_zero(self):
        with self.assertRaises(ValueError):
            operations.divide(5, 0)

if __name__ == '__main__':
    unittest.main()
