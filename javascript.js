function createExpense(type, amount) {
    return {
    type,
    amount,
    }
};

const expense = createExpense("Phone bill", 10);

for (let key in expense) {
    console.log(expense[key]);
}

const element = document.querySelector("#one");
console.log(element);
element.style.backgroundColor = "green"