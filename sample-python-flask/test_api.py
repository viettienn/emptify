import app
import unittest

class TestApp(unittest.TestCase):
    def setUp(self):
        self.app = app.app.test_client()

    def test_hello_vietnam(self):
        response = self.app.get('/')
        self.assertEqual(response.data, 'Hello Vietnam!')

if __name__ == "__main__":
    unittest.main()
