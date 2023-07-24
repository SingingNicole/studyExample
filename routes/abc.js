const express = require('express');

const router = express.Router();

// GET / 라우터
router.get('/user/:id', (req, res) => {
  res.send(req.params.id + " : " + req.query.name);
});

module.exports = router;
