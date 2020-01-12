//! Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
//!
//! push(x) -- Push element x onto stack.
//! pop() -- Removes the element on top of the stack.
//! top() -- Get the top element.
//! getMin() -- Retrieve the minimum element in the stack.
//!
//!
//!
//! Example:
//!
//! MinStack minStack = new MinStack();
//! minStack.push(-2);
//! minStack.push(0);
//! minStack.push(-3);
//! minStack.getMin();   --> Returns -3.
//! minStack.pop();
//! minStack.top();      --> Returns 0.
//! minStack.getMin();   --> Returns -2.
//!

struct MinStack {
    vec: Vec<i32>,
    min: i32,
}

/**
 * `&self` means the method takes an immutable reference.
 * If you need a mutable reference, change it to `&mut self` instead.
 */
impl MinStack {
    /** initialize your data structure here. */
    fn new() -> Self {
        MinStack {
            vec: vec!(),
            min: i32::max_value(),
        }
    }

    fn push(&mut self, x: i32) {
        if self.vec.is_empty() {
            self.min = i32::max_value();
        }

        self.vec.push(x);

        if x < self.min {
            self.min = x;
        }
    }

    fn pop(&mut self) {
        self.vec.pop();

        match self.vec.iter().min() {
            Some(s) => {
                self.min = *s;
            }
            None => {}
        }
    }

    fn top(&self) -> i32 {
        match self.vec.last() {
            Some(s) => {
                *s
            }
            None => {
                i32::max_value()
            }
        }
    }

    fn get_min(&self) -> i32 {
        self.min
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * let obj = MinStack::new();
 * obj.push(x);
 * obj.pop();
 * let ret_3: i32 = obj.top();
 * let ret_4: i32 = obj.get_min();
 */
#[cfg(test)]
mod tests {
    use super::MinStack;

    #[test]
    fn test_0() {
        let mut min_stack = MinStack::new();
        min_stack.push(-2);
        min_stack.push(0);
        min_stack.push(-3);

        assert_eq!(min_stack.get_min(), -3);

        min_stack.pop();

        assert_eq!(min_stack.top(), 0);
        assert_eq!(min_stack.get_min(), -2);
    }

    #[test]
    fn test_1() {
        let mut min_stack = MinStack::new();
        min_stack.push(2147483646); // stack: [2147483646]
        min_stack.push(2147483646); // stack: [2147483646, 2147483646]
        min_stack.push(2147483647); // stack: [2147483646, 2147483646, 2147483647]

        assert_eq!(min_stack.top(), 2147483647); // stack: [2147483646, 2147483646, 2147483647]

        min_stack.pop(); // stack: [2147483646, 2147483646]

        assert_eq!(min_stack.get_min(), 2147483646); // stack: [2147483646, 2147483646]

        min_stack.pop(); // stack: [2147483646]

        assert_eq!(min_stack.get_min(), 2147483646); // stack: [2147483646]

        min_stack.pop(); // stack: []

        min_stack.push(2147483647); // stack: [2147483647]

        min_stack.top(); // stack: [2147483647]

        assert_eq!(min_stack.get_min(), 2147483647); // stack: [2147483647]

        min_stack.push(-2147483648); // stack: [2147483647, -2147483648]

        assert_eq!(min_stack.top(), -2147483648); // stack: [2147483647, -2147483648]
        assert_eq!(min_stack.get_min(), -2147483648); // stack: [2147483647, -2147483648]

        min_stack.pop(); // stack: [2147483647]

        assert_eq!(min_stack.get_min(), 2147483647); // stack: [2147483647]
    }
}