from code import interact
from payment import Payment

class Cash(Payment):
    number = int
    cvv = int
    date = str

    def __init__(self, id, number, cvv, date):
        super().__init__(id)
        self.number = number
        self.cvv = cvv
        self.date = date