function setupProxy() {
  const tls = process.env.TLS;
  const conf = [
    {
      context: [
        '/api',
        '/services',
        '/management',
        '/swagger-resources',
        '/v2/api-docs',
        '/v3/api-docs',
        '/h2-console',
        '/oauth2',
        '/login',
        '/auth',
        '/health',
      ],
      target: `http${tls ? 's' : ''}://localhost:9080`,
      secure: false,
      changeOrigin: tls,
    },
    {
      context: ['/websocket'],
      target: 'ws://127.0.0.1:9080',
      ws: true,
    },
  ];
  return conf;
}

module.exports = setupProxy();
